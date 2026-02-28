package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoAdd: ImageVector
    get() {
        val current = _videoAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 2.0f, dx3 = 7.0f, dy3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.34f, dx2 = -0.02f, dy2 = 0.67f)
                lineToRelative(dx = -0.14f, dy = -0.17f)
                lineToRelative(dx = -0.03f, dy = -0.04f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.54f, dy1 = -0.1f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.62f, dy1 = 5.46f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.82f, dy1 = 0.99f)
                lineToRelative(dx = 0.04f, dy = 0.03f)
                lineToRelative(dx = 0.16f, dy = 0.14f)
                quadTo(x1 = 15.35f, y1 = 22.0f, x2 = 15.0f, y2 = 22.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.0f, dx3 = -7.0f, dy3 = -7.0f)
                verticalLineToRelative(dy = -1.97f)
                moveToRelative(dx = 0.52f, dy = -5.92f)
                horizontalLineToRelative(dx = 18.96f)
                moveToRelative(dx = -12.96f, dy = -5.0f)
                verticalLineToRelative(dy = 4.86f)
                moveToRelative(dx = 6.96f, dy = -4.86f)
                verticalLineToRelative(dy = 4.41f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 23.0f, y = 18.5f)
                arcToRelative(a = 4.72f, b = 4.72f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 2.32f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.5f, y1 = 23.0f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.82f, dy1 = -1.02f)
                horizontalLineToRelative(dx = -0.01f)
                lineToRelative(dx = -0.16f, dy = -0.14f)
                lineToRelative(dx = -0.04f, dy = -0.03f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.82f, dy1 = -0.99f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.62f, dy1 = -5.46f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.54f, dy1 = 0.1f)
                lineToRelative(dx = 0.03f, dy = 0.04f)
                lineToRelative(dx = 0.14f, dy = 0.17f)
                arcTo(horizontalEllipseRadius = 4.4f, verticalEllipseRadius = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 23.0f, y1 = 18.5f)
                moveToRelative(dx = -2.82f, dy = -0.02f)
                horizontalLineToRelative(dx = -3.36f)
                moveToRelative(dx = 1.68f, dy = -1.64f)
                verticalLineToRelative(dy = 3.36f)
            }
        }.build().also { _videoAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _videoAdd: ImageVector? = null
