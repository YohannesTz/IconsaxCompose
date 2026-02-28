package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudNotif: ImageVector
    get() {
        val current = _cloudNotif
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudNotif",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.9f, y = 13.96f)
                arcToRelative(a = 5.1f, b = 5.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.63f, dy1 = 4.72f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.64f, dy1 = 1.4f)
                horizontalLineTo(x = 5.54f)
                curveToRelative(dx1 = -4.67f, dy1 = -0.34f, dx2 = -4.68f, dy2 = -7.14f, dx3 = 0.0f, dy3 = -7.48f)
                horizontalLineToRelative(dx = 0.05f)
                curveToRelative(dx1 = -2.19f, dy1 = -6.13f, dx2 = 3.5f, dy2 = -9.73f, dx3 = 7.79f, dy3 = -8.35f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.26f, y = 13.01f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.67f, dy1 = -0.41f)
                moveToRelative(dx = 16.38f, dy = -4.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.51f, dy2 = 2.09f, dx3 = -1.32f, dy3 = 2.73f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.68f, dy1 = -2.73f)
                arcTo(horizontalEllipseRadius = 3.4f, verticalEllipseRadius = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 6.04f)
                verticalLineTo(y = 6.03f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.47f, y1 = 5.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.5f, dy1 = 3.5f)
            }
        }.build().also { _cloudNotif = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudNotif: ImageVector? = null
