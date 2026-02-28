package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dislike: ImageVector
    get() {
        val current = _dislike
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dislike",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 2.35f, y = 13.96f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.87f, dy1 = 0.88f)
                horizontalLineToRelative(dx = 4.1f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 15.15f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.2f, dy1 = 0.77f)
                lineToRelative(dx = -0.5f, dy = 3.28f)
                arcToRelative(a = 2.16f, b = 2.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.4f, dy1 = 2.41f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.42f, dy1 = -0.77f)
                lineToRelative(dx = 4.2f, dy = -6.27f)
                lineToRelative(dx = 0.13f, dy = -0.2f)
                verticalLineTo(y = 5.53f)
                lineTo(x = 16.7f, y = 5.38f)
                lineToRelative(dx = -3.17f, dy = -2.45f)
                curveToRelative(dx1 = -0.42f, dy1 = -0.42f, dx2 = -1.37f, dy2 = -0.65f, dx3 = -2.04f, dy3 = -0.65f)
                horizontalLineTo(x = 7.6f)
                curveToRelative(dx1 = -1.34f, dy1 = 0.0f, dx2 = -2.7f, dy2 = 1.01f, dx3 = -3.0f, dy3 = 2.24f)
                lineToRelative(dx = -2.45f, dy = 7.5f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = 1.94f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.79f, y = 17.6f)
                horizontalLineToRelative(dx = 1.03f)
                curveToRelative(dx1 = 1.55f, dy1 = 0.0f, dx2 = 2.18f, dy2 = -0.6f, dx3 = 2.18f, dy3 = -2.07f)
                verticalLineTo(y = 5.48f)
                curveTo(x1 = 22.0f, y1 = 4.0f, x2 = 21.37f, y2 = 3.4f, x3 = 19.82f, y3 = 3.4f)
                horizontalLineToRelative(dx = -1.03f)
                curveToRelative(dx1 = -1.55f, dy1 = 0.0f, dx2 = -2.18f, dy2 = 0.6f, dx3 = -2.18f, dy3 = 2.08f)
                verticalLineToRelative(dy = 10.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.47f, dx2 = 0.63f, dy2 = 2.07f, dx3 = 2.18f, dy3 = 2.07f)
            }
        }.build().also { _dislike = it }
    }

@Suppress("ObjectPropertyName")
private var _dislike: ImageVector? = null
