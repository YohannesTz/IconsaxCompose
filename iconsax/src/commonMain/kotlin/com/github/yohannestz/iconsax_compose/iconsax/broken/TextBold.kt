package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextBold: ImageVector
    get() {
        val current = _textBold
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TextBold",
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
                moveTo(x = 4.88f, y = 4.5f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineTo(x = 12.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 9.5f)
                horizontalLineTo(x = 4.88f)
                close()
                moveToRelative(dx = 0.0f, dy = 9.48f)
                verticalLineTo(y = 12.0f)
                horizontalLineToRelative(dx = 9.5f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 9.5f)
                horizontalLineToRelative(dx = -7.5f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = -2.0f)
                verticalLineToRelative(dy = -1.54f)
            }
        }.build().also { _textBold = it }
    }

@Suppress("ObjectPropertyName")
private var _textBold: ImageVector? = null
