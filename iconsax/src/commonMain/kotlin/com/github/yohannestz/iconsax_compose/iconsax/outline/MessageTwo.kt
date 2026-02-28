package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageTwo: ImageVector
    get() {
        val current = _messageTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.5f, y = 11.25f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.09f, y1 = 9.75f, x2 = 8.5f, y2 = 9.75f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 22.32f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.97f, dy1 = -0.29f)
                lineToRelative(dx = -4.26f, dy = -2.84f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.44f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -2.3f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineToRelative(dy = -6.0f)
                curveTo(x1 = 1.25f, y1 = 4.0f, x2 = 3.56f, y2 = 1.7f, x3 = 7.0f, y3 = 1.7f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.44f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.31f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.18f, dx2 = -1.98f, dy2 = 5.4f, dx3 = -5.0f, dy3 = 5.71f)
                verticalLineToRelative(dy = 1.42f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.92f, dy1 = 1.54f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 22.32f)
                moveTo(x = 7.0f, y = 3.18f)
                curveToRelative(dx1 = -2.58f, dy1 = 0.0f, dx2 = -4.25f, dy2 = 1.67f, dx3 = -4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.58f, dx2 = 1.67f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 4.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.42f, dy1 = 0.13f)
                lineToRelative(dx = 4.45f, dy = 2.96f)
                arcToRelative(a = 0.2f, b = 0.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.26f, dy1 = 0.01f)
                arcToRelative(a = 0.2f, b = 0.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.13f, dy1 = -0.22f)
                verticalLineToRelative(dy = -2.13f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.75f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -1.67f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.58f, dx2 = -1.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                close()
            }
        }.build().also { _messageTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _messageTwo: ImageVector? = null
