package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Book: ImageVector
    get() {
        val current = _book
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Book",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.5f, y = 16.0f)
                verticalLineToRelative(dy = 2.5f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 22.0f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.5f, dy1 = -3.5f)
                verticalLineToRelative(dy = -0.65f)
                arcTo(horizontalEllipseRadius = 2.86f, verticalEllipseRadius = 2.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.35f, y1 = 15.0f)
                horizontalLineTo(x = 19.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                moveToRelative(dx = -5.0f, dy = -14.0f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = 1.0f, dx3 = -5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 7.58f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.85f, dy1 = -1.08f)
                horizontalLineTo(x = 19.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.0f, dx2 = -1.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                moveTo(x = 13.0f, y = 10.75f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 9.25f, x2 = 8.0f, y2 = 9.25f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 3.0f, dy = -3.5f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 5.75f, x2 = 8.0f, y2 = 5.75f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 7.25f, x2 = 16.0f, y2 = 7.25f)
            }
        }.build().also { _book = it }
    }

@Suppress("ObjectPropertyName")
private var _book: ImageVector? = null
