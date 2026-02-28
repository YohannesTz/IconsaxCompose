package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bill: ImageVector
    get() {
        val current = _bill
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bill",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.25f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.32f, dy1 = -0.77f)
                lineToRelative(dx = -5.21f, dy = -3.9f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.55f, dy1 = -3.1f)
                verticalLineTo(y = 1.76f)
                horizontalLineToRelative(dx = 18.16f)
                verticalLineToRelative(dy = 12.72f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.55f, dy1 = 3.1f)
                lineToRelative(dx = -5.21f, dy = 3.9f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.25f)
                moveToRelative(dx = -7.58f, dy = -19.0f)
                verticalLineToRelative(dy = 11.22f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.95f, dy1 = 1.9f)
                lineToRelative(dx = 5.21f, dy = 3.9f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.85f, dy1 = 0.0f)
                lineToRelative(dx = 5.21f, dy = -3.9f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.95f, dy1 = -1.9f)
                verticalLineTo(y = 3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 3.25f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 1.75f, x2 = 2.0f, y2 = 1.75f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 22.41f, y1 = 3.25f, x2 = 22.0f, y2 = 3.25f)
                moveToRelative(dx = -6.0f, dy = 5.5f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 7.59f, y1 = 8.75f, x2 = 7.25f, y2 = 8.41f, x3 = 7.25f, y3 = 8.0f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 7.25f, x2 = 8.0f, y2 = 7.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 8.75f, x2 = 16.0f, y2 = 8.75f)
                moveToRelative(dx = 0.0f, dy = 5.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 12.25f, x2 = 8.0f, y2 = 12.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _bill = it }
    }

@Suppress("ObjectPropertyName")
private var _bill: ImageVector? = null
