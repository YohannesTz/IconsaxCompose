package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagRight: ImageVector
    get() {
        val current = _tagRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TagRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.67f, y = 21.65f)
                horizontalLineTo(x = 4.22f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.6f, dy1 = -1.53f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.7f, y1 = 17.1f)
                lineToRelative(dx = 2.77f, dy = -4.43f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.34f)
                lineTo(x = 1.7f, y = 6.9f)
                curveTo(x1 = 1.12f, y1 = 5.97f, x2 = 1.09f, y2 = 4.84f, x3 = 1.62f, y3 = 3.88f)
                reflectiveCurveToRelative(dx1 = 1.51f, dy1 = -1.53f, dx2 = 2.6f, dy2 = -1.53f)
                horizontalLineToRelative(dx = 11.44f)
                curveToRelative(dx1 = 0.94f, dy1 = 0.0f, dx2 = 2.03f, dy2 = 0.6f, dx3 = 2.52f, dy3 = 1.4f)
                lineToRelative(dx = 4.18f, dy = 6.68f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.13f, dy1 = 3.13f)
                lineToRelative(dx = -5.18f, dy = 6.9f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.38f, dy1 = 1.2f)
                moveTo(x = 4.22f, y = 3.85f)
                curveToRelative(dx1 = -0.54f, dy1 = 0.0f, dx2 = -1.03f, dy2 = 0.28f, dx3 = -1.29f, dy3 = 0.76f)
                reflectiveCurveToRelative(dx1 = -0.25f, dy1 = 1.04f, dx2 = 0.04f, dy2 = 1.5f)
                lineToRelative(dx = 2.77f, dy = 4.43f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.94f)
                lineToRelative(dx = -2.77f, dy = 4.43f)
                curveToRelative(dx1 = -0.29f, dy1 = 0.46f, dx2 = -0.3f, dy2 = 1.02f, dx3 = -0.04f, dy3 = 1.5f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.76f, dx2 = 1.29f, dy2 = 0.76f)
                horizontalLineToRelative(dx = 10.45f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.18f, dy1 = -0.59f)
                lineToRelative(dx = 5.18f, dy = -6.9f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.06f, dy1 = -1.43f)
                lineToRelative(dx = -4.18f, dy = -6.68f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.25f, dy1 = -0.69f)
                horizontalLineTo(x = 4.22f)
                close()
            }
        }.build().also { _tagRight = it }
    }

@Suppress("ObjectPropertyName")
private var _tagRight: ImageVector? = null
