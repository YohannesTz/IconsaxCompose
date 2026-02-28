package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HouseTwo: ImageVector
    get() {
        val current = _houseTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HouseTwo",
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
                moveTo(x = 2.0f, y = 22.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveTo(x = 3.0f, y = 9.97f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.77f, y1 = 8.4f)
                lineToRelative(dx = 7.0f, dy = -5.45f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.46f, dy1 = 0.0f)
                lineToRelative(dx = 7.0f, dy = 5.44f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.0f, y1 = 9.97f)
                verticalLineTo(y = 22.0f)
                moveTo(x = 2.95f, y = 22.0f)
                lineToRelative(dx = 0.03f, dy = -7.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.5f, y = 11.0f)
                horizontalLineToRelative(dx = -7.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 12.5f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 10.0f)
                verticalLineToRelative(dy = -9.5f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.5f, dy1 = -1.5f)
                moveTo(x = 10.0f, y = 16.25f)
                verticalLineToRelative(dy = 1.5f)
                moveTo(x = 10.5f, y = 7.5f)
                horizontalLineToRelative(dx = 3.0f)
            }
        }.build().also { _houseTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _houseTwo: ImageVector? = null
