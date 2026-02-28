package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SafeHome: ImageVector
    get() {
        val current = _safeHome
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SafeHome",
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
                moveTo(x = 23.0f, y = 15.37f)
                verticalLineToRelative(dy = 2.2f)
                arcToRelative(a = 5.8f, b = 5.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.2f, dy1 = 5.4f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 5.7f, verticalEllipseRadius = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.34f, y1 = 21.0f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.25f, dy1 = -3.44f)
                verticalLineToRelative(dy = -2.19f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.69f, dy1 = -1.04f)
                lineToRelative(dx = 2.78f, dy = -1.14f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.96f, dy1 = 0.0f)
                lineToRelative(dx = 1.0f, dy = 0.41f)
                lineToRelative(dx = 1.79f, dy = 0.73f)
                arcTo(horizontalEllipseRadius = 1.2f, verticalEllipseRadius = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 23.0f, y1 = 15.37f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.95f, y = 11.01f)
                lineToRelative(dx = -0.43f, dy = 2.6f)
                lineToRelative(dx = -1.0f, dy = -0.42f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.96f, dy1 = 0.0f)
                lineToRelative(dx = -2.78f, dy = 1.14f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.69f, dy1 = 1.04f)
                verticalLineToRelative(dy = 2.2f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.34f, y1 = 21.0f)
                horizontalLineTo(x = 6.18f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.89f, dy1 = -2.44f)
                lineToRelative(dx = -1.26f, dy = -7.55f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = -2.77f)
                lineToRelative(dx = 6.58f, dy = -5.26f)
                arcTo(horizontalEllipseRadius = 3.05f, verticalEllipseRadius = 3.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.32f, y1 = 3.0f)
                lineToRelative(dx = 6.58f, dy = 5.25f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 2.77f)
            }
        }.build().also { _safeHome = it }
    }

@Suppress("ObjectPropertyName")
private var _safeHome: ImageVector? = null
