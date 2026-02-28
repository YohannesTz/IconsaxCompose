package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Driver: ImageVector
    get() {
        val current = _driver
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Driver",
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
                moveTo(x = 19.32f, y = 10.0f)
                horizontalLineTo(x = 4.69f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.68f, dy1 = -2.68f)
                verticalLineTo(y = 4.69f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.68f, dy1 = -2.68f)
                horizontalLineToRelative(dx = 14.63f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 4.69f)
                verticalLineToRelative(dy = 2.63f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.32f, y1 = 10.0f)
                moveToRelative(dx = 0.0f, dy = 12.0f)
                horizontalLineTo(x = 4.69f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.68f, dy1 = -2.68f)
                verticalLineToRelative(dy = -2.63f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.68f, dy1 = -2.68f)
                horizontalLineToRelative(dx = 14.63f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 16.69f)
                verticalLineToRelative(dy = 2.63f)
                arcTo(horizontalEllipseRadius = 2.7f, verticalEllipseRadius = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.32f, y1 = 22.0f)
                moveTo(x = 6.0f, y = 5.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = 4.0f, dy = -2.0f)
                verticalLineToRelative(dy = 2.0f)
                moveTo(x = 6.0f, y = 17.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = 4.0f, dy = -2.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = 4.0f, dy = -13.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -4.0f, dy = 12.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _driver = it }
    }

@Suppress("ObjectPropertyName")
private var _driver: ImageVector? = null
