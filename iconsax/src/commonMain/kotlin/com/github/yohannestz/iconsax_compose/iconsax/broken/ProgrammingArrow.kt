package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProgrammingArrow: ImageVector
    get() {
        val current = _programmingArrow
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProgrammingArrow",
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
                moveTo(x = 19.0f, y = 16.0f)
                verticalLineTo(y = 6.5f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = -4.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 2.0f)
                lineToRelative(dx = -3.0f, dy = 2.5f)
                lineTo(x = 15.0f, y = 7.0f)
                moveTo(x = 5.0f, y = 9.0f)
                verticalLineToRelative(dy = 7.0f)
                moveTo(x = 5.25f, y = 2.0f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.5f)
                arcTo(horizontalEllipseRadius = 3.26f, verticalEllipseRadius = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 5.25f)
                moveTo(x = 5.0f, y = 22.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
                moveToRelative(dx = 14.0f, dy = 0.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.0f)
            }
        }.build().also { _programmingArrow = it }
    }

@Suppress("ObjectPropertyName")
private var _programmingArrow: ImageVector? = null
