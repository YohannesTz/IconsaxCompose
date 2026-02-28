package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Coffee: ImageVector
    get() {
        val current = _coffee
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Coffee",
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
                moveTo(x = 2.0f, y = 13.55f)
                verticalLineToRelative(dy = -3.08f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.21f, dy1 = -4.2f)
                horizontalLineToRelative(dx = 7.37f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.21f, dy1 = 4.2f)
                verticalLineToRelative(dy = 7.32f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 13.58f, y1 = 22.0f)
                horizontalLineTo(x = 6.21f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 17.8f)
                moveTo(x = 5.5f, y = 4.0f)
                verticalLineTo(y = 2.25f)
                moveTo(x = 9.5f, y = 4.0f)
                verticalLineTo(y = 2.25f)
                moveToRelative(dx = 4.0f, dy = 1.75f)
                verticalLineTo(y = 2.25f)
                moveTo(x = 22.0f, y = 13.16f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.21f, dy1 = 4.21f)
                verticalLineTo(y = 8.95f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 13.16f)
                moveTo(x = 2.0f, y = 12.0f)
                horizontalLineToRelative(dx = 15.51f)
            }
        }.build().also { _coffee = it }
    }

@Suppress("ObjectPropertyName")
private var _coffee: ImageVector? = null
